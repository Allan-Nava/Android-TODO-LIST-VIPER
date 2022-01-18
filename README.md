# Android TODO List VIPER
![Android Pull Request & Master CI](https://github.com/Allan-Nava/Android-TODO-LIST-VIPER/workflows/Android%20Pull%20Request%20&%20Master%20CI/badge.svg) ![Android Feature Branch CI](https://github.com/Allan-Nava/Android-TODO-LIST-VIPER/workflows/Android%20Feature%20Branch%20CI/badge.svg)

La parola VIPER sta per View, Interactor, Presenter, Entity and Router.

- **View**: Classe che ha tutto il codice per mostrare le interfacce app all'utente e prendere le loro risposte. Una volta ricevuto una risposta invia un messaggio di allerta al presenter
- **Interactor**: È il cervello dell'intero progetto che ha tutta la ( BLOC ) logica dell'app. Principalemente è responsabile di fare chiamate API e di recuperare dati dalla sorgente ( API BACKEND ). Responsabile nel fare le chiamate ma non necessariamente da se stesso .es Nel nostro caso viene usato il REMOTE DATA MANAGER.
- **Presenter**: Nucleo dei moduli. Prende la risponsta dalla View and la lavora di conseguenza. L'unica class che comunica con tutti gli altri componenti es. chiamare il router per il cambio di vista, interactor per recuperare i dati ( chiamate newtworks o dati locali), visualizzare gli aggiornamenti dell'UI. È totalmente indipendente dall'UIKIT
- **Entity** : Contiene i dati che poi verranno usati dall'interactor es. WidgetViewModel
- **Router**: Esegue il cambio di vista ( wire-framing ). Ascolta il Present per indicare quale schermata visualizzare ed eseguire.
 
[ cit.] ( https://medium.com/@priyanka.lohri/what-is-viper-and-why-it-is-best-to-choose-1d6345080c64)
[ cit.] (https://cheesecakelabs.com/blog/using-viper-architecture-android/)

### Struttura delle nostre app

- **BaseActivity ( Folder )**
-- ApiClient : Classe che si occupa della gestione delle API ( OKHTTP )
-- BaseActivity : Classe astratta che estende la AppCompactActivity
-- BaseContracts : Intefaccia che contiene le funzioni della view, del presenter , Interactor, Interactor Output, Router
-- BaseFragments :  Classe astratta che estende la Fragment
-- BaseRemoteInteractor : Classe che inizializza l'ApiClient 
-- BaseViewGroup : Classe astratta che estende il FrameLayout
-- NomeAppApplication : Classe che estende l'application ed è la prima classe ad essere eseguita

- **BaseVideo ( folder )**
-- BaseVideoActivity 
-- BaseVideoContracts  
-- BaseVideoFragment 
-- BaseVideoInteractor 
-- BaseVideoPresenter 
-- BaseVideoRemoteDataManager 
-- BaseVideoRouter 

È il core dell'applicazione perchè tutte queste classi vengono usate come base per VIPER.



<img src="https://koenig-media.raywenderlich.com/uploads/2020/02/viper.png">

<img src="https://miro.medium.com/max/1354/1*HZIOzvXyvkpW4ytr2g0NvQ.png">

VIPER is an architectural approach for iOS mobile app development based on the paradigm of Uncle Bob's clean architecture, which gradually began to penetrate with Android. The word VIPER is an abbreviation for View, Interactor, Presenter, Entity, and Router.

## Documentations :
- https://cheesecakelabs.com/blog/using-viper-architecture-android/
- https://medium.com/omisoft/https-medium-com-omisoft-viper-in-android-the-practical-guide-or-how-to-catch-a-snake-78cc17e96d63
- https://www.raywenderlich.com/5192-android-viper-tutorial#toc-anchor-001
