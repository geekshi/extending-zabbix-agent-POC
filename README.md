# Extending zabbix agent POC
This is a proof of concept on how to extend zabbix agent to collect monitoring data for a specific system.

## Overview
The specific system called `aor` provides a RESTful API that can be used for collecting monitoring data.

Define user-defined parameters in zabbix agent to represent these monitoring data and call RESTful API to collect data through a Python script.

Zabbix agent sends collected data to zabbix server in JSON format.

The collected data get presented in zabbix web UI.

## Code structure
src/aor - aor RESTful API

src/zabbix_agent - include aor.py collecting data from aor

## How to run
cd src/aor

mvn install

java -jar aor-0.0.1-SNAPSHOT.jar

Add UserParameter to zabbix_agentd.conf:
```
UserParameter=aor.data, python /usr/local/zabbix/lib/aor/aor.py
```

Restart zabbix agent

Create host and item `aor.data` in zabbix server

Observe coming data in Monitoring -> Latest data in zabbix web UI
