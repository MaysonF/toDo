package entity;

import javax.persistence.*;

@Entity
public class Itemlist {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "iditemlist")
    private int iditemlist;
    @Basic
    @Column(name = "itemsonlist")
    private String itemsonlist;

    public int getIditemlist() {
        return iditemlist;
    }

    public void setIditemlist(int iditemlist) {
        this.iditemlist = iditemlist;
    }

    public String getItemsonlist() {
        return itemsonlist;
    }

    public void setItemsonlist(String itemsonlist) {
        this.itemsonlist = itemsonlist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Itemlist itemlist = (Itemlist) o;

        if (iditemlist != itemlist.iditemlist) return false;
        if (itemsonlist != null ? !itemsonlist.equals(itemlist.itemsonlist) : itemlist.itemsonlist != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iditemlist;
        result = 31 * result + (itemsonlist != null ? itemsonlist.hashCode() : 0);
        return result;
    }
}
