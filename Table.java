public class Table {
private int width;
private int length;
    private Table table; //your table
public Table() {//Default Constructor
width = 1;
length = 1;
}

public Table(int length, int width) {
this.length = length;
this.width = width;
}

public int getcalculateSize(Table otherTable) {
int area = 0; 
if(!connectTable(otherTable)) {
area = length * width;
}
else {
area =  (length * width)+(otherTable.length * otherTable.width);
//Use .length and .Width since we can call our private instance variables
//We have no get method so we can't call a get method
}
return area;//return just my table
}
public boolean connectTable(Table otherTable) {
if(this.table == null) {
return false;
}
else {
this.connectTable(otherTable);
otherTable.connectTable(this); 
return true; 
}
}
}
