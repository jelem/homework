package mail;

public class Mail {

  private static final int maxLetters = 10;
  Letter[] inbox;
  Letter[] outbox;
  int counterInbox;
  int counterOutbox;

  public Mail() {
    this.inbox = new Letter[maxLetters];
    this.outbox = new Letter[maxLetters];
    counterInbox = 0;
    counterOutbox = 0;
  }

  public void addInboxLetter(Letter letter) {
    if (counterInbox == maxLetters) {
      System.out.println("mail is full");
    } else {
      this.inbox[counterInbox] = letter;
      counterInbox++;
    }
  }

  public void removeInboxLetter() {
    if (counterInbox == 0) {
      System.out.println("mail is empty");
    } else {
      this.inbox[counterInbox] = null;
      counterInbox--;
    }
  }

  public void addOutboxLetter(Letter letter) {
    if (counterOutbox == maxLetters) {
      System.out.println("mail is full");
    } else {
      this.outbox[counterOutbox] = letter;
      counterOutbox++;
    }
  }

  public void removeOutboxLetter() {
    if (counterOutbox == 0) {
      System.out.println("mail is empty");
    } else {
      this.outbox[counterOutbox] = null;
      counterOutbox--;
    }
  }

  public int getCounterInbox() {
    return counterInbox;
  }

  public int getCounterOutbox() {
    return counterOutbox;
  }
}
