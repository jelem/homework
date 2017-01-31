package mailbox;

public class Message {

  private int id;
  private String title;
  private String text;

  public Message(String title, String text) {
    this.title = title;
    this.text = text;
  }

  public Message() {
    this.title = "";
    this.text = "";
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String toString() {
    return "Ид: " + this.id + " Тайтл: " + this.title + " Сообщение: " + this.text;
  }
}
