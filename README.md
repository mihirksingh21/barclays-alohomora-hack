# GoogleMapCurrentLocation
# Track My Location
This is a simple android app where you can brodcast your location and everyone who has your dynamically generated unique key can track you in near real-time.

I created this project just for learning puposes particularly about firebase (firestore db), google maps api and google location api.

- [Backend (Firebase Cloud Functions)](https://github.com/abdularis/Track-My-Location_Cloud-Functions)

*
### Screenshots
![WhatsApp Image 2023-04-01 at 7 44 16 AM](https://user-images.githubusercontent.com/92274883/229261182-5efbcf70-f63e-4f2f-9878-17ced73c315c.jpeg)![WhatsApp Image 2023-04-01 at 7 44 16 AM (1)](https://user-images.githubusercontent.com/92274883/229261184-637c77b3-6278-4167-a92e-1e18f8d49b7d.jpeg)![WhatsApp Image 2023-04-01 at 7 44 16 AM (2)](https://user-images.githubusercontent.com/92274883/229261187-0d93c677-ad77-4821-87d2-ea8ce18c5955.jpeg)![WhatsApp Image 2023-04-01 at 7 44 17 AM](https://user-images.githubusercontent.com/92274883/229261191-cad4c94e-8c0f-4740-a6ea-f6215e143357.jpeg)![WhatsApp Image 2023-04-01 at 7 44 17 AM (1)](https://user-images.githubusercontent.com/92274883/229261193-0c4b67ff-02b4-4c52-8c56-06666b5bdd36.jpeg)


*
### Built With
* [![Android Studio]


<p align="right">(<a href="#readme-top">back to top</a>)</p>
### References
- [Set Up Google Play Services](https://developers.google.com/android/guides/setup)
- [Getting Started - Google Maps](https://developers.google.com/maps/documentation/android-api/start)
- [Get API Key](https://developers.google.com/maps/documentation/android-api/signup)
- [Add Marker in Maps](https://developers.google.com/maps/documentation/android-api/map-with-marker)
- Firebase Documentation (Guides) ([Link](https://firebase.google.com/docs/guides/))
- [Get Started with Firebase Firestore](https://firebase.google.com/docs/firestore/quickstart)
- [Firestore Data Model](https://firebase.google.com/docs/firestore/data-model)
- [Firestore - Get Data](https://firebase.google.com/docs/firestore/query-data/get-data)
- [Firestore - Structure Data](https://firebase.google.com/docs/firestore/manage-data/structure-data)

*

### How it works?
![](images/hiw.png)
![hiw](https://user-images.githubusercontent.com/92274883/229263527-97bd297d-1196-443c-b37b-85ae99973c3e.png)


- The first device get continous location update from gps, network etc. then
- Write and update the location data to a specific firebase firestore document
- Last, the second device read that firebase firestore document and show the marker in that location


*
### Hot to integrate Google Maps & Location API
To use google maps in an android app you can use `SupportMapFragment` or `MapView`

- Using google maps fragment (inside a layout or as a root tag)
 
xml
<fragment
	android:id="@+id/map"
	android:name="com.google.android.gms.maps.SupportMapFragment"
	android:layout_width="match_parent"
	android:layout_height="match_parent"/>


- Then you have to add permissions and google maps api key in the AndroidManifest.xml file
- ![as_1](https://user-images.githubusercontent.com/92274883/229263569-75c9ead3-9ca0-48fe-a1d4-74f54c0edb25.png)


![](images/as_1.png)
> Add permisions for coase and fine location also add meta-data tag for API key

*
### Integrate Google Play Services for Firebase into android project
- Add this gradle plugin `'com.google.gms:google-services:3.1.1'` into dependencies block of the top-level gradle build file

![](images/gr_1.png)
![gr_1](https://user-images.githubusercontent.com/92274883/229263595-6a884d08-5ca6-43b8-808b-f767cf776617.png)

- Apply the google play services plugin in the app level gradle build file (app project)

![gr_2](https://user-images.githubusercontent.com/92274883/229263660-21e307b2-7d72-4238-87de-f7a1ab042fc1.png)

![](images/gr_2.png)

- Then you can add google play services library for maps, location, places etc. (firebase needs google play services to operate)

![](images/gr_3.png)

- You need to download and add `google-services.json` file to your `project_name/app/` directory from firebase console when you add an android app to your firebase project
- Here are the complete figure

![](images/fb_4.png)

![](images/fb_1.png)




*
### Getting API Key for Google Maps & Location
- Go to the google cloud console page and click credentials submenu (or [Get API Key](https://developers.google.com/maps/documentation/android-api/signup) )

![](images/ga_1.png)
![ga_1](https://user-images.githubusercontent.com/92274883/229263687-0eb26ea8-3c05-4d6c-b522-64c85e85c370.png)

- Then create a new credential


![](images/ga_2.png)
![ga_2](https://user-images.githubusercontent.com/92274883/229263696-42730443-27f7-4cb4-b9dd-fc5815fe300c.png)


- New API key has been created, you can copy the key and paste in the manifest file. To restrict access of the key click the restrict button

![](images/ga_3.png)


- You can restrict api key usage by selecting the platform or IP address by which the api call would be requested (Application restrictions)

![](images/ga_4.png)
![ga_4](https://user-images.githubusercontent.com/92274883/229263709-f46ee8c1-10f6-4f85-96df-bab4a1e7f645.png)

1. Select one of the application restrictions (in this case Android)
2. Insert your android app package name
3. Insert SHA-1 fingerprint of your app
4. Click Save button

_
> - To get SHA-1 key you can use your android studo by opening your particular project -> select signingReport gradle task -> copy & paste the SHA-1 key into the android app restriction form

![](images/as_2.png)
![as_2](https://user-images.githubusercontent.com/92274883/229263730-114a2d24-0747-4916-b12a-8ed3b8066a30.png)


[TEAM]
![team](https://user-images.githubusercontent.com/92274883/229263896-659eafb0-2911-4f63-a1bf-875d11025302.png)
