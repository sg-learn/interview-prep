package com.java.hackerrank.array;

public class ImageTransformation {

	public static int[][] getFinalImage(int[][] image, int rotation, int verticalFlip, int horizontalFlip) {
		int n = image.length;
		int[][] result = image;

		// Step 1: Rotation
		rotation = rotation % 360;
		if (rotation == 90) {
			result = rotate90(result);
		} else if (rotation == 180) {
			result = rotate90(rotate90(result));
		} else if (rotation == 270) {
			result = rotate90(rotate90(rotate90(result)));
		}

		// Step 2: Vertical Flip (top to bottom)
		if (verticalFlip == 1) {
			result = verticalFlip(result);
		}

		// Step 3: Horizontal Flip (left to right)
		if (horizontalFlip == 1) {
			result = horizontalFlip(result);
		}

		return result;
	}

	// Rotate image 90 degrees clockwise
	private static int[][] rotate90(int[][] image) {
		int n = image.length;
		int[][] rotated = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotated[j][n - 1 - i] = image[i][j];
			}
		}
		return rotated;
	}

	// Flip image vertically (top ↔ bottom)
	private static int[][] verticalFlip(int[][] image) {
		int n = image.length;
		int[][] flipped = new int[n][n];

		for (int i = 0; i < n; i++) {
			flipped[n - 1 - i] = image[i].clone();
		}
		return flipped;
	}

	// Flip image horizontally (left ↔ right)
	private static int[][] horizontalFlip(int[][] image) {
		int n = image.length;
		int[][] flipped = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				flipped[i][n - 1 - j] = image[i][j];
			}
		}
		return flipped;
	}

	// Helper method to print image
	public static void printImage(int[][] image) {
		for (int[] row : image) {
			for (int pixel : row) {
				System.out.print(pixel + " ");
			}
			System.out.println();
		}
	}

	// Example usage
	public static void main(String[] args) {
		int[][] image = { { 1, 0, 0 }, { 0, 1, 1 }, { 0, 0, 1 } };

		int rotation = 270;
		int verticalFlip = 0;
		int horizontalFlip = 1;

		int[][] finalImage = getFinalImage(image, rotation, verticalFlip, horizontalFlip);
		printImage(finalImage);
	}
}
