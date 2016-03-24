#!/bin/python

# Convert AM/PM Time to Military (24h) time
# https://www.hackerrank.com/challenges/time-conversion
import sys

time = raw_input().strip()

def timeConverter(time):
    hours = time[0:2] 
    minutes = time[3:5]
    seconds = time[6:8]
    pam = time[8]
    if (pam == 'P' or pam == 'p') and hours != "12":
        hours = int(hours) + 12;
    if (pam == 'A' or pam == 'a') and hours == "12":
        hours = 0;
    
    if hours == 0:
        hours = "0" + str(hours)
    
    return str(hours) + ":" + str(minutes) + ":" + str(seconds)

print timeConverter(time)

# Test Cases #0-#9: 0s
