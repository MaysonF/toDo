package entity;

import javax.persistence.*;

@Entity
@Table(name = "added_items", schema = "jsp_web_app", catalog = "")
public class AddedItems {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "add_id")
    private int addId;
    @Basic
    @Column(name = "added_item_name")
    private String addedItemName;

    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    public String getAddedItemName() {
        return addedItemName;
    }

    public void setAddedItemName(String addedItemName) {
        this.addedItemName = addedItemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddedItems that = (AddedItems) o;

        if (addId != that.addId) return false;
        if (addedItemName != null ? !addedItemName.equals(that.addedItemName) : that.addedItemName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addId;
        result = 31 * result + (addedItemName != null ? addedItemName.hashCode() : 0);
        return result;
    }
}
