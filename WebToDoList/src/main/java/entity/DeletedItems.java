package entity;

import javax.persistence.*;

@Entity
@Table(name = "deleted_items", schema = "jsp_web_app", catalog = "")
public class DeletedItems {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "delete_id")
    private int deleteId;
    @Basic
    @Column(name = "deleted_item_name")
    private String deletedItemName;

    public int getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(int deleteId) {
        this.deleteId = deleteId;
    }

    public String getDeletedItemName() {
        return deletedItemName;
    }

    public void setDeletedItemName(String deletedItemName) {
        this.deletedItemName = deletedItemName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeletedItems that = (DeletedItems) o;

        if (deleteId != that.deleteId) return false;
        if (deletedItemName != null ? !deletedItemName.equals(that.deletedItemName) : that.deletedItemName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deleteId;
        result = 31 * result + (deletedItemName != null ? deletedItemName.hashCode() : 0);
        return result;
    }
}
