package com.company;

public class Customer {
    public Account account;
    private Address shippingAddress;
    private Address billingAddress;
    private boolean isRewardsMember = false;

    public Customer(Account account, Address shippingAddress, Address billingAddress) {
        this.account = account;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isRewardsMember() {
        return isRewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        isRewardsMember = rewardsMember;
    }
}
/***
 First name, Last name, Email, Phone number
 Shipping address:
 Street 1
 Street 2
 City
 State
 Zip

 Billing address:
 Street 1
 Street 2
 City
 State
 Zip
 Whether or not the customer is a Rewards Member.
 **/