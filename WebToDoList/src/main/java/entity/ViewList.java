package entity;

import javax.persistence.*;

@Entity
@Table(name = "view_list", schema = "jsp_web_app", catalog = "")
public class ViewList {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "view_id")
    private int viewId;
    @Basic
    @Column(name = "view_item_list")
    private String viewItemList;

    public int getViewId() {
        return viewId;
    }

    public void setViewId(int viewId) {
        this.viewId = viewId;
    }

    public String getViewItemList() {
        return viewItemList;
    }

    public void setViewItemList(String viewItemList) {
        this.viewItemList = viewItemList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewList viewList = (ViewList) o;

        if (viewId != viewList.viewId) return false;
        if (viewItemList != null ? !viewItemList.equals(viewList.viewItemList) : viewList.viewItemList != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = viewId;
        result = 31 * result + (viewItemList != null ? viewItemList.hashCode() : 0);
        return result;
    }
}
