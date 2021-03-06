# Team IdeaaVailla - Ohjelmistoprojekti 2
[![Website](https://img.shields.io/badge/-spring-brightgreen)](https://spring.io/)
[![Website](https://img.shields.io/badge/-bluetooth-blue)](https://www.bluetooth.com/)

## Table of contents

- [Project description](#project-description)
- [Built with](#built-with)
- [Getting started](#getting-started)
	- [Frontend](#frontend)
		- [Prerequisities](#prerequisities)
		- [Installation](#installation)
	- [Backend](#backend)
		- [Prerequisities](#prerequisities)
		- [Installation](#installation)
		- [API Endpoints](#api-endpoints)
	- [Python script](#python-script)
		- [Prerequisities](#prerequisities)
		- [Installation](#installation)
- [Roadmap](#roadmap)
- [Contributors](#contributors)
- [Acknowledgements](#acknowledgements)
- [Licences](#licences)

## Project description

The main motive for this project was to create a solution to fulfill the need to keep track of people located in different areas in Helsinki. We got this idea from an outside source which was a sort of partner during this Ohjelmistoprojekti 2 -course. They presented us a few ideas and thoughts and among them was a thought of keeping track of the traveller flows in Helsinki. This need of getting data about people present in different locations seemed to be a good fit for this course and that's why we ended up sticking with it. 

We bounced around a couple of ideas on how to build the solution. Eventually we decided to go with Bluetooth technology because it seemed to be the best way to get data on how many people approximately are in a specific location. 

To get the amount of devices sending Bluetooth data we used Raspberry Pi 3. It collects data of nearby devices that are using Bluetooth and then sends this data to the back-end. 

We set up REST API to provide a straightforward way to access the collected data.

We also built a simple mobile application - mainly to demonstrate how we had thought to use the collected data.  

![](bt-scanner-app/images/Map.png)
&nbsp;&nbsp;&nbsp;&nbsp;
![](bt-scanner-app/images/Location_card.png)
&nbsp;&nbsp;&nbsp;&nbsp;
![](bt-scanner-app/images/List.png)

## Built With

* React Native
* Java
* Python

## Getting Started

### Frontend
`./bt-scanner-app`

#### Prerequisites

Front end/Mobile app

* npm
  ```bash
  npm install -g npm@latest
  ```
* expo
  ```bash
  npm install -g expo-cli
  ```
* node.js
  ```bash
  download the latest LTS version: https://nodejs.org/en/download/
  ```

#### Installation

1. Clone the repo
  ```bash
  git clone https://github.com/lennikorhonen/OhjelmistoProjekti2.git
  ```

2. Navigate to bt-scanner-app directory
  ```bash
  cd Ohjelmistoprojekti2/bt-scanner-app/
  ```

3. Install packages
  ```bash
  npm install
  ```
  
4. Start fake REST API
  ```bash
  npm run server
  ```

5. In another terminal, with Android emulator up and running, start Metro Bundler
  ```bash
  npm run android
  ```

### Backend
`./RaspberryServer`

#### Prerequisities

**Java 8** is required.	

Clone the full repository OR only the backend directory:
```
https://github.com/lennikorhonen/OhjelmistoProjekti2/RaspberryServer
```
Import as existing Maven Project, then navigate to:
```
/OhjelmistoProjekti2/RaspberryServer/src/main/java/Ohjelmistoprojekti2/raspberryServer
```

and run `RaspberryServerAppliction.java` as Java Application to start the server in localhost `port: 8080`.

#### Endpoints

Fetch login page using `GET` request:
```
http://localhost:8080/login
```
Fetch events for Admin panel using `GET` Request:
```
http://localhost:8080/raspberrylist
```
Default path listing API endpoints using `GET` request:
```
http://localhost:8080/login
```
Fetch saved Raspberry Pi devices using `GET` request:
```
http://localhost:8080/api/raspberries
```
Fetch a single saved Raspberry Pi by {location] using `GET` request:
```
http://localhost:8080/api/raspberries/{location}
```
Fetch saved scan results using `GET` request:
```
http://localhost:8080/api/results
```
Save new Raspberry Pi into database using `POST` request:
```
http://localhost:8080/api/raspberries
```
Save new scan result of existing Raspberry Pi using `POST` request:
```
http://localhost:8080/api/results
```

### Python script
`./python_bt`

**Python 3.0** is required. Newest LTS is recommended.

#### Installation

`Pip install -r requirements.txt`

Failing, you can install dependencies one by one:

    sudo apt install python-dev
    sudo apt install libbluetooth-dev
    pip3 install pybluez
    pip3 install schedule
    pip3 install ipinfo
    
## Roadmap

As of 10.12.2020, project development is currently halted and further support discontinued.

## Contributors

* [@JoonasKulmala](https://github.com/JoonasKulmala)
* [@OttoKorhonen](https://github.com/OttoKorhonen)
* [@LenniKorhonen](https://github.com/lennikorhonen)
* [@AnnikaHaapalahti](https://github.com/rusinainen)
* [@RoopeLaakso](https://github.com/Rohelaa)

## Acknowledgements

We'd like to thank **Helsinki Marketing** for providing their API and support.

## Licences

Distributed under the [MIT](https://choosealicense.com/licenses/mit/) license.
