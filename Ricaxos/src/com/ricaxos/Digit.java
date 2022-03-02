package com.ricaxos;

import java.time.LocalDate;

/**
 * Simple class for adjust the console output. It makes more easy read the console.
 * @author Ricard Penin Honrubia "@ricaxos"
 * @version 1.0
 */
public class Digit {

	// configurable attributes
	private char colWidth = 32; // chars

	// non-configurable attributes

	/**
	 * Function where the number X are the spaces to fill the column width.
	 * 
	 * @param string to adjust the column width
	 * @return repetion of ASCII: Alt + 32 / " "
	 */
	public String spaceX(String string) {
		return " ".repeat(colWidth - string.length());
	}

	// Function spaceX() overloaded
	public String spaceX(LocalDate date) {
		return " ".repeat(colWidth - String.valueOf(date.toString()).length());
	}

	public String spaceX(byte number) {
		return " ".repeat(colWidth - String.valueOf(number).length());
	}

	public String spaceX(short number) {
		return " ".repeat(colWidth - String.valueOf(number).length());
	}

	public String spaceX(int number) {
		return " ".repeat(colWidth - String.valueOf(number).length());
	}

	public String spaceX(long number) {
		return " ".repeat(colWidth - String.valueOf(number).length());
	}

	public String spaceX(float number) {
		return " ".repeat(colWidth - String.valueOf(number).length());
	}

	public String spaceX(double number) {
		return " ".repeat(colWidth - String.valueOf(number).length());
	}
}
/*
 * private static byte auxByte; // 1 byte private static short auxShort; // 2
 * bytes private static int auxInt; // 4 bytes private static long auxLong; // 8
 * bytes
 * 
 * private static float auxFloat; // 4 bytes private static double auxDouble; //
 * 8 bytes
 * 
 * public byte digitLength(byte number) {
 * 
 * // initialize auxByte = number; byte i = 0;
 * 
 * // function while ( auxByte != 0 ){ auxByte /= 10; i++; } return i; }
 * 
 * public short digitLength(short number) {
 * 
 * // initialize auxShort = number; short i = 0;
 * 
 * // function while ( auxShort != 0 ){ auxShort /= 10; i++; } return i; }
 * 
 * public int digitLength(int number) {
 * 
 * // initialize auxInt = number; int i = 0;
 * 
 * // function while ( auxint != 0 ){ auxint /= 10; i++; } return i; } }
 */