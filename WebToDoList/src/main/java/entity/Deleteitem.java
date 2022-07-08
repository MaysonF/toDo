package entity;

import javax.persistence.*;

@Entity
public class Deleteitem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iddeleteitem")
    private int iddeleteitem;
    @Basic
    @Column(name = "deleteditemname")
    private String deleteditemname;

    public int getIddeleteitem() {
        return iddeleteitem;
    }

    public void setIddeleteitem(int iddeleteitem) {
        this.iddeleteitem = iddeleteitem;
    }

    public String getDeleteditemname() {
        return deleteditemname;
    }

    public void setDeleteditemname(String deleteditemname) {
        this.deleteditemname = deleteditemname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Deleteitem that = (Deleteitem) o;

        if (iddeleteitem != that.iddeleteitem) return false;
        if (deleteditemname != null ? !deleteditemname.equals(that.deleteditemname) : that.deleteditemname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddeleteitem;
        result = 31 * result + (deleteditemname != null ? deleteditemname.hashCode() : 0);
        return result;
    }
}
