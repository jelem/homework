package mailbox;

import java.util.Arrays;

public class Mailbox {

  private static final int MAX = 10;
  private Message[] folderIncoming;
  private Message[] folderSent;
  private int counterIncoming;
  private int counterSent;

  public Mailbox() {
    this.folderIncoming = new Message[MAX];
    this.folderSent = new Message[MAX];
  }

  public boolean sentMessage(Message message) {
    if (counterSent == MAX) {
      System.out.println("Full sent folder");
      return false;
    }
    folderSent[counterSent] = message;
    counterSent++;
    return true;
  }

  public boolean acceptMessage(Message message) {
    if (counterIncoming == MAX) {
      System.out.println("Full incoming folder");
      return false;
    }
    folderIncoming[counterIncoming] = message;
    counterIncoming++;
    return true;
  }

  public boolean removeSentMessage() {
    if (counterSent == 0) {
      System.out.println("Empty Sent folder");
      return false;
    }
    folderSent[counterSent] = null;
    counterSent--;
    return true;
  }

  public boolean removeIncomingMessage() {
    if (counterIncoming == 0) {
      System.out.println("Empty incoming folder");
      return false;
    }
    folderSent[counterIncoming] = null;
    counterIncoming--;
    return true;
  }

  public String getIncoming() {
    return Arrays.toString(this.folderIncoming);
  }

  public String getFolderSent() {
    return Arrays.toString(this.folderSent);
  }

  public static void main(String[] args) {
    Mailbox mailbox = new Mailbox();
    mailbox.sentMessage(new Message("Test", "text"));
    System.out.println(mailbox);
  }
}
