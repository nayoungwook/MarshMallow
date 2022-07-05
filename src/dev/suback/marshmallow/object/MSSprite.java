package dev.suback.marshmallow.object;

import java.awt.Color;
import java.awt.image.BufferedImage;

import dev.suback.marshmallow.resource.MSResource;

public class MSSprite {

	private BufferedImage image;

	public MSSprite(String path) {
		image = new MSResource().getImage(path);
	}

	public MSSprite(BufferedImage image) {
		this.image = image;
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}

	public MSSprite cutImage(int x, int y, int w, int h) {
		BufferedImage cutImage = clone();
		return new MSSprite(cutImage.getSubimage(x, y, w, h));
	}

	public final BufferedImage clone() {
		BufferedImage _result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_ARGB);

		for (int i = 0; i < image.getWidth(); i++) {
			for (int j = 0; j < image.getHeight(); j++) {
				Color c = new Color(image.getRGB(i, j), true);

				if (c.getAlpha() != 0)
					_result.setRGB(i, j, image.getRGB(i, j));
				else
					_result.setRGB(i, j, new Color(0, 0, 0, 0).getRGB());
			}
		}

		return _result;
	}

}
