package com.Interface.МетодПоУмолчанию;

// Implement MyIF.
class MyIFImp implements MyIF {
    // Only getUserID() defined by MyIF needs to be implemented.
    // getAdminID() can be allowed to default.
    public int getUserID() {
        return 100;
    }
}