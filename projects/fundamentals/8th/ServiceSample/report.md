## report
### started service control
onCreate -> onStartCommand -> onDestroy

### Bound Service Control
onCreate -> onServiceConnected -> onUnbind -> onDestroy

### Intent Service Control
onCreate -> OnStartCommand -> onHndleIntent -> onDestroy