# -*- coding: utf-8 -*-
#!/usr/bin/python

import urllib2
import sys

def main():
	url = 'http://10.140.212.178:8080/data'
	req = urllib2.Request(url)
	try:
		resp = urllib2.urlopen(req)
	except urllib2.HTTPError as error:
		print("Cannot remove service instance!", error)
		sys.exit(1)
	response = resp.read()
	print(response)

if __name__ == '__main__':
	main()

