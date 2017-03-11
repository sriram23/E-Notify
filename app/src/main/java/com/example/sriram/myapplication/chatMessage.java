public class ChatMessage {
 
    private String messageText;
    private long messageTime;
 
    public ChatMessage(String messageText) {
        this.messageText = messageText;
        
        // Initialize to current time
        messageTime = new Date().getTime();
    }
 
    public ChatMessage(){
 
    }
  public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
 
   public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}
