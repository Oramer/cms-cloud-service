package com.cms.base_service.common;

public class ChartModel {
    private String id;
    private String name;
    private String chartType;

    /*  5 */
    public void setId(String id) {
        this.id = id;
    }

    private Object legendData;
    private Object xData;
    private Object yData;
    private String yRowsCell;

    public void setName(String name) {
        this.name = name;
    }

    public void setChartType(String chartType) {
        this.chartType = chartType;
    }

    public void setLegendData(Object legendData) {
        this.legendData = legendData;
    }

    public void setXData(Object xData) {
        this.xData = xData;
    }

    public void setYData(Object yData) {
        this.yData = yData;
    }

    public void setYRowsCell(String yRowsCell) {
        this.yRowsCell = yRowsCell;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ChartModel)) return false;
        ChartModel other = (ChartModel) o;
        if (!other.canEqual(this)) return false;
        Object this$id = getId(), other$id = other.getId();
        if ((this$id == null) ? (other$id != null) : !this$id.equals(other$id)) return false;
        Object this$name = getName(), other$name = other.getName();
        if ((this$name == null) ? (other$name != null) : !this$name.equals(other$name)) return false;
        Object this$chartType = getChartType(), other$chartType = other.getChartType();
        if ((this$chartType == null) ? (other$chartType != null) : !this$chartType.equals(other$chartType))
            return false;
        Object this$legendData = getLegendData(), other$legendData = other.getLegendData();
        if ((this$legendData == null) ? (other$legendData != null) : !this$legendData.equals(other$legendData))
            return false;
        Object this$xData = getXData(), other$xData = other.getXData();
        if ((this$xData == null) ? (other$xData != null) : !this$xData.equals(other$xData)) return false;
        Object this$yData = getYData(), other$yData = other.getYData();
        if ((this$yData == null) ? (other$yData != null) : !this$yData.equals(other$yData)) return false;
        Object this$yRowsCell = getYRowsCell(), other$yRowsCell = other.getYRowsCell();
        return !((this$yRowsCell == null) ? (other$yRowsCell != null) : !this$yRowsCell.equals(other$yRowsCell));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ChartModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $id = getId();
        result = result * 59 + (($id == null) ? 43 : $id.hashCode());
        Object $name = getName();
        result = result * 59 + (($name == null) ? 43 : $name.hashCode());
        Object $chartType = getChartType();
        result = result * 59 + (($chartType == null) ? 43 : $chartType.hashCode());
        Object $legendData = getLegendData();
        result = result * 59 + (($legendData == null) ? 43 : $legendData.hashCode());
        Object $xData = getXData();
        result = result * 59 + (($xData == null) ? 43 : $xData.hashCode());
        Object $yData = getYData();
        result = result * 59 + (($yData == null) ? 43 : $yData.hashCode());
        Object $yRowsCell = getYRowsCell();
        return result * 59 + (($yRowsCell == null) ? 43 : $yRowsCell.hashCode());
    }

    public String toString() {
        return "ChartModel(id=" + getId() + ", name=" + getName() + ", chartType=" + getChartType() + ", legendData=" + getLegendData() + ", xData=" + getXData() + ", yData=" + getYData() + ", yRowsCell=" + getYRowsCell() + ")";
    }


    public String getId() {
        /*  9 */
        return this.id;
    }

    public String getName() {
        /* 11 */
        return this.name;
    }

    public String getChartType() {
        /* 13 */
        return this.chartType;
    }

    public Object getLegendData() {
        /* 15 */
        return this.legendData;
    }

    public Object getXData() {
        /* 17 */
        return this.xData;
    }

    public Object getYData() {
        /* 19 */
        return this.yData;
    }

    public String getYRowsCell() {
        /* 21 */
        return this.yRowsCell;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\ChartModel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */