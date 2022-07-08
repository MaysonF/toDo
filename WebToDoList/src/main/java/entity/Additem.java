package entity;

import javax.persistence.*;

@Entity
public class Additem {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idadditem")
    private int idadditem;
    @Basic
    @Column(name = "addeditemname")
    private String addeditemname;

    public int getIdadditem() {
        return idadditem;
    }

    public void setIdadditem(int idadditem) {
        this.idadditem = idadditem;
    }

    public String getAddeditemname() {
        return addeditemname;
    }

    public void setAddeditemname(String addeditemname) {
        this.addeditemname = addeditemname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Additem additem = (Additem) o;

        if (idadditem != additem.idadditem) return false;
        if (addeditemname != null ? !addeditemname.equals(additem.addeditemname) : additem.addeditemname != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idadditem;
        result = 31 * result + (addeditemname != null ? addeditemname.hashCode() : 0);
        return result;
    }
}
