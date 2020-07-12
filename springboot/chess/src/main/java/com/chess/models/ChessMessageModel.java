/**
 * @author Mai Thành Duy An [tiachop0102@gmail.com]
 * 
 */
package com.chess.models;

public class ChessMessageModel {

    private MessageType type;
    private String content;
    private String player;

    public enum MessageType {
	JOIN, MOVE, BACK, LEAVE
    }

    /**
     * @return the type
     */
    public MessageType getType() {
	return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(MessageType type) {
	this.type = type;
    }

    /**
     * @return the content
     */
    public String getContent() {
	return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
	this.content = content;
    }

    /**
     * @return the player
     */
    public String getPlayer() {
	return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(String player) {
	this.player = player;
    }

    @Override
    public String toString() {
	return "ChessMessageModel [type=" + type + ", content=" + content + ", player=" + player + "]";
    }

}
