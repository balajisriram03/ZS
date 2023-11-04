import java.util.Iterator;
import java.util.List;

class ReverseIterator implements Iterator{
    List <String> list;
    public ReverseIterator(List list){
       this.list=list;
       this.currentIndex = list.size()-1;
    }
    

        
    @Override
    public boolean hasNext(){
        curentIndex--;
        return list.get(currentIndex)!=null;
    }
    @Override
    public object next(){
        
        return null;
    }
}