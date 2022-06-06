import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class TestUnit {
    static Calculation cal1;
    int arr[] ={1,2,3,4,5};
    int num = 5;
    String word = "zxc";
    @Before
    public void setUpClass(){
        cal1 = new Calculation();

    }

    @Test
    public void shouldFindMin(){

        int res = cal1.findMin(arr);
//        System.out.println(res);
        Assert.assertEquals("Result should be 1",1,res);
    }

    @Test
    public void FaildFindMin(){
        int res = cal1.findMin(arr);
        Assert.assertNotEquals("Result should be 1",11,res);
    }

    @Test
    public void shouldFindMax(){

        int res = cal1.findMax(arr);
        Assert.assertEquals("Result should be 5",5,res);
    }

    @Test
    public void FaildFindMax(){
        int res = cal1.findMax(arr);
        Assert.assertNotEquals("Result should be 5",11,res);
    }

    @Test
    public void shouldCube(){

        int res = cal1.cube(num);
        Assert.assertEquals("Result should be 125",125,res);
    }

    @Test
    public void faildCube(){

        int res = cal1.cube(num);
        Assert.assertNotEquals("Result should be 125",130,res);
    }

    @Test
    public void shouldSquare(){

        int res = cal1.square(num);
        Assert.assertEquals("Result should be 25",25,res);
    }

    @Test
    public void faildSquare(){

        int res = cal1.square(num);
        Assert.assertNotEquals("Result should be 25",130,res);
    }


    @Test
    public void shouldRevers(){

        String res = cal1.reverseWord(word);
        Assert.assertEquals("Result should be 25","cxz",res);
    }

    @Test
    public void faildReverse(){

        String res = cal1.reverseWord(word);
        Assert.assertNotEquals("Result should be 25","uuu",res);
    }

}
