package gwt.material.design.client.events;

import com.google.gwt.event.shared.EventHandler;
import com.google.gwt.event.shared.GwtEvent;

public class TextChangeEvent extends GwtEvent<TextChangeEvent.TextChangeEventHandler> {
 
	public interface TextChangeEventHandler extends EventHandler {
	  void onTextChange(TextChangeEvent event);
	}
	
  public static final Type<TextChangeEventHandler> TYPE = new Type<TextChangeEventHandler>();
 
  @Override
  public Type<TextChangeEventHandler> getAssociatedType() {
    return TYPE;
  }
 
  @Override
  protected void dispatch(TextChangeEventHandler handler) {
    handler.onTextChange(this);
  }
  
  private boolean userEvent = false;
  
  public TextChangeEvent(){	  
  }
  
  public TextChangeEvent(boolean userEvent){
	  this.userEvent = userEvent;
  }
  
  public boolean isUserEvent() {
	return userEvent;
  }
}