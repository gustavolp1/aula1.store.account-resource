package insper.store.account;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Entity
@Table(name = "account")
@EqualsAndHashCode(of = "id")
@Builder @Getter @Setter @Accessors(chain = true, fluent = true)
@NoArgsConstructor @AllArgsConstructor
public class AccountModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_account")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "hash")
    private String hash;

    public AccountModel(Account a) {
        this.id = a.id();
        this.name = a.name();
        this.email = a.email();
        this.hash = a.hash();
    }	

    public Account to() {
        return new Account()
            .id(this.id)
            .name(this.name)
            .email(this.email)
            .hash(this.hash);
    }
}
