import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SILab2Test {
    private final SILab2 lab = new SILab2();
    private List<Time> list = new ArrayList<>();
    private List<Integer> result = new ArrayList<>();


    @Test
    public void MultipleCondition() {
        List<Time> empty_list = new ArrayList<>();
        List<Time> list1 = new ArrayList<>();
        list1.add(new Time(-1,2,2));
        List<Time> list2 = new ArrayList<>();
        list2.add(new Time(25,2,2));
        List<Time> list3 = new ArrayList<>();
        list3.add(new Time(3,2,2));
        List<Time> list4 = new ArrayList<>();
        list4.add(new Time(23,-2,2));
        List<Time> list5 = new ArrayList<>();
        list5.add(new Time(23,62,2));
        List<Time> list6 = new ArrayList<>();
        list6.add(new Time(23,2,62));
        List<Time> list7 = new ArrayList<>();
        list7.add(new Time(23,2,-2));

        RuntimeException exception = null;
        assertTrue(lab.function(list).isEmpty());
        result.add(10922);
        assertEquals(result, lab.function(list3));
        try{
            lab.function(list1);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The hours are smaller than the minimum"));
        try{
            lab.function(list2);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The hours are grater than the maximum"));
        try{
            lab.function(list4);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The minutes are not valid!"));
        try{
            lab.function(list5);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The minutes are not valid!"));
        try{
            lab.function(list6);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The seconds are not valid"));
        try{
            lab.function(list7);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The seconds are not valid"));
    }
    @Test
    public void eachBranch(){
        List<Time> list1 = new ArrayList<>();
        list1.add(new Time(-1,2,2));
        List<Time> list2 = new ArrayList<>();
        list2.add(new Time(26,2,2));
        List<Time> list3 = new ArrayList<>();
        list3.add(new Time(3,2,2));
        List<Time> list4 = new ArrayList<>();
        list4.add(new Time(23,-2,2));
        List<Time> list5 = new ArrayList<>();
        list5.add(new Time(23,62,2));
        List<Time> list6 = new ArrayList<>();
        list6.add(new Time(23,2,62));
        List<Time> list7 = new ArrayList<>();
        list7.add(new Time(23,2,-2));
        List<Time> list8 = new ArrayList<>();
        list8.add(new Time(24,0,0));
        List<Time> list9 = new ArrayList<>();
        list9.add(new Time(24,2,2));
        RuntimeException exception = null;
        result.add(10922);
        assertEquals(result, lab.function(list3));
        try{
            lab.function(list1);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The hours are smaller than the minimum"));
        try{
            lab.function(list2);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The hours are grater than the maximum"));
        try{
            lab.function(list4);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The minutes are not valid!"));
        try{
            lab.function(list5);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The minutes are not valid!"));
        try{
            lab.function(list6);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The seconds are not valid"));
        try{
            lab.function(list7);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The seconds are not valid"));
        try{
            lab.function(list9);
        }catch (RuntimeException ex){
            exception =ex;
        }
        assertTrue(exception.getMessage().equals("The time is greater than the maximum"));

        result.remove(0);
        result.add(86400);
        assertEquals(result, lab.function(list8));

    }
}
