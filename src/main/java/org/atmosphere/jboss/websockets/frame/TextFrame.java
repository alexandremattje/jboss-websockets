package org.atmosphere.jboss.websockets.frame;

import org.atmosphere.jboss.websockets.FrameType;
import org.atmosphere.jboss.websockets.FrameType;

/**
 * @author Mike Brock
 */
public class TextFrame extends AbstractFrame {
  private final String text;

  private TextFrame(String text) {
    super(FrameType.Text);
    this.text = text;
  }

  public static TextFrame from(final String text) {
    return new TextFrame(text);
  }

  public String getText() {
    return text;
  }
}
