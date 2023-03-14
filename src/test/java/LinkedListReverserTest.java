import org.example.LinkedListReverser;
import org.example.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListReverserTest {
    @Test
    public void reverseListTest() {
        LinkedListReverser linkedListReverser = new LinkedListReverser();

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode reversed1 = linkedListReverser.reverseList(list1);
        Assert.assertEquals(4, reversed1.val);
        Assert.assertEquals(3, reversed1.next.val);
        Assert.assertEquals(2, reversed1.next.next.val);
        Assert.assertEquals(1, reversed1.next.next.next.val);

        ListNode list2 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode reversed2 = linkedListReverser.reverseList(list2);
        Assert.assertEquals(3, reversed2.val);
        Assert.assertEquals(2, reversed2.next.val);
        Assert.assertEquals(1, reversed2.next.next.val);

        ListNode list3 = null;
        ListNode reversed3 = linkedListReverser.reverseList(list3);
        Assert.assertNull(reversed3);
    }
}
