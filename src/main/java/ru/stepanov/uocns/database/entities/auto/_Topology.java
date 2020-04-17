package ru.stepanov.uocns.database.entities.auto;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

/**
 * Class _Topology was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Topology extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<Integer> COLUMNS = Property.create("columns", Integer.class);
    public static final Property<String> DESCRIPTION = Property.create("description", String.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<Integer> NODES = Property.create("nodes", Integer.class);
    public static final Property<Integer> ROWS = Property.create("rows", Integer.class);

    public void setColumns(int columns) {
        writeProperty("columns", columns);
    }
    public int getColumns() {
        Object value = readProperty("columns");
        return (value != null) ? (Integer) value : 0;
    }

    public void setDescription(String description) {
        writeProperty("description", description);
    }
    public String getDescription() {
        return (String)readProperty("description");
    }

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void setNodes(int nodes) {
        writeProperty("nodes", nodes);
    }
    public int getNodes() {
        Object value = readProperty("nodes");
        return (value != null) ? (Integer) value : 0;
    }

    public void setRows(int rows) {
        writeProperty("rows", rows);
    }
    public int getRows() {
        Object value = readProperty("rows");
        return (value != null) ? (Integer) value : 0;
    }

}
