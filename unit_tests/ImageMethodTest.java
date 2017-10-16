package test;

import org.junit.Assert;

import java.io.File;
import java.io.IOException;

import org.junit.Test;

import a3.Image;

public class ImageMethodTest {

        @Test
        public void TagMethodsShouldAlterImageFileName() throws IOException {
        	       	
        	// Setting up the image file to be tested
        	Image imageFile = new Image(new File("C:\\Users\\User\\Documents\\as3\\group_0721\\image.png"));
        	Image imageFile2 = new Image(new File("C:\\Users\\User\\Documents\\as3\\group_0721\\image2.png"));
        	Image imageFile3 = new Image(new File("C:\\Users\\User\\Documents\\as3\\group_0721\\image3.png"));
        	

        	// First testing the addTag method
            imageFile.addTag("test");
            imageFile2.addTag("");
            imageFile3.addTag("@");
            Assert.assertTrue(imageFile.img.getName().equals("image@test.png"));
            Assert.assertTrue(imageFile2.img.getName().equals("image2@.png"));
            Assert.assertTrue(imageFile3.img.getName().equals("image3@@.png"));

            
            // Testing the removeTag method
            imageFile.removeTag("test");
            imageFile2.removeTag("abc123");
            imageFile3.removeTag("");
            Assert.assertTrue(imageFile.img.getName().equals("image.png"));
            Assert.assertTrue(imageFile2.img.getName().equals("image2@.png"));
            Assert.assertTrue(imageFile3.img.getName().equals("image3@@.png"));
            
            // Testing the revert method
            imageFile.revert(2);
            imageFile2.revert(1);
            imageFile3.revert(1);
            Assert.assertTrue(imageFile.img.getName().equals("image@test.png"));
            Assert.assertTrue(imageFile2.img.getName().equals("image2.png"));
            Assert.assertTrue(imageFile3.img.getName().equals("image3.png"));
        }
        
        
}