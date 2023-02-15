

package com.Bridgelabz.qa.api_automation;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class RestApi_Automation_Testing_Test {
	
	String token;
	
	@BeforeTest
	
	public void getToken() {
		token = "Bearer BQDNV6-xuJHufiyjsxbADhlBip2NvpYLi5Fh7ypa1PYYtAPgHG5QwSkUimuBThN8d8BTNDYyJO5uYsv1FG8njq0TcuSpRPi4ydHA9oVahSnEno7XCyUoUYh5sIJNeLPQCu38QDlMAcFvpea1GZvhBEPC75ugaxM6U3ysrD_vmPyAwjzW2nYmuG_LWjyU39AQmF5L_wPUtuziGXVyASRB9Mc5eRj9tPR6zDuvoGVBZxn-BZcifYLlEEUrrBW2hxWPOvwS6Y7iKkyytUi33yH3LuySBPNKDvblmnw";
	}
	
	@Test
	
    public void get_Current_User_Profile() {
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
		        .accept(ContentType.JSON)
		        .header("Authorization",token)
		        .when()
		        .get("https://api.spotify.com/v1/me");
		response.prettyPrint(); 
	}
	
@Test
	
    public void get_User_Profile() {
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
		        .accept(ContentType.JSON)
		        .header("Authorization",token)
		        .when()
		        .get("https://api.spotify.com/v1/users/31zabbzphpk5w7ga37eyjqd2lopm");
		response.prettyPrint(); 
	}
	
	
	
	@Test
	
     public void Create_Playlist() {
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
		        .accept(ContentType.JSON)
		        .header("Authorization",token)
		        .body("{\n"
		        		+ "  \"name\": \"Lata Mangeshkar\",\n" 
		        		+ "  \"description\": \"new playlist description\",\n"
		        		+ "  \"public\": false\n"
		        		+ "}")		       
		        .when()
		        .post("https://api.spotify.com/v1/users/31zabbzphpk5w7ga37eyjqd2lopm/playlists\r\n"
		        		+ "");
		response.prettyPrint(); 
	}
	
	@Test
	
   public void Get_Playlist() {
		
		Response response = RestAssured.given()
				.contentType(ContentType.JSON)
		        .accept(ContentType.JSON)
		        .header("Authorization",token)
		        .when()
		        .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n");
		response.prettyPrint(); 
	}
		
	
@Test

public void Get_Playlist_Item() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks");
	response.prettyPrint(); 
      }

@Test

public void Get_User_Playlist() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .get("https://api.spotify.com/v1/users/smedjan/playlists");
	response.prettyPrint(); 
}

@Test

public void Get_Playlist_Cover_Image() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .get("https://api.spotify.com/v1/me/playlists");
	response.prettyPrint(); 
}

@Test

public void Update_Playlist() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .put("https://api.spotify.com/v1/playlists/4HrcW7dcl3ZJkBt3cDyWUR/tracks?uris=spotify:track:0CtZpaOhtzvLV3FfcsVpQo");
	response.prettyPrint(); 
}

@Test

public void Get_Current_User_Playlist() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .get("https://api.spotify.com/v1/me/playlists\r\n");
	response.prettyPrint(); 
}

@Test

public void Add_Item_To_Playlist() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .post("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks\r\n");
	response.prettyPrint(); 
}


@Test

public void Change_Playlist_Details() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n\r\n");
	response.prettyPrint();
	
}




@Test

public void Search_For_Item() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .when()
	        .get("https://api.spotify.com/v1/search?q=shivani&type=track");
	response.prettyPrint(); 
}

@Test

public void Get_Track() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .get("https://api.spotify.com/v1/tracks/4rNlSH6WP8ML0Yke8sPmNx");
	response.prettyPrint(); 
}

@Test

public void Get_Several_Track() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .get("https://api.spotify.com/v1/tracks");
	response.prettyPrint();

 }
	

@Test

public void Get_Track_Audio_Analysis() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .get("https://api.spotify.com/v1/audio-analysis/11dFghVXANMlKmJXsNCbNl");
	response.prettyPrint();

 }

@Test

public void Get_Tracks_Audio_Features() {
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .get("https://api.spotify.com/v1/audio-features");
	response.prettyPrint();

 }

@Test

public void Get_Track_Audio_Features() {
	
	
	Response response = RestAssured.given()
			.contentType(ContentType.JSON)
	        .accept(ContentType.JSON)
	        .header("Authorization",token)
	        .get("https://api.spotify.com/v1/audio-features/11dFghVXANMlKmJXsNCbNl");
	response.prettyPrint();

 }



}

