# Linux Networking Commands

## man

built-in documentation and instruction manuals for commands


## ifconfig
enp2s0: flags=4163<UP,BROADCAST,RUNNING,MULTICAST>  mtu 1500
        inet 10.10.1.75  netmask 255.255.0.0  broadcast 10.10.255.255
        inet6 fe80::d4a7:e1b7:cf58:2ec0  prefixlen 64  scopeid 0x20<link>
        ether f4:6b:8c:8c:ed:40  txqueuelen 1000  (Ethernet)
        RX packets 486364  bytes 159602143 (159.6 MB)
        RX errors 0  dropped 85  overruns 0  frame 0
        TX packets 144109  bytes 13942801 (13.9 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

lo: flags=73<UP,LOOPBACK,RUNNING>  mtu 65536
        inet 127.0.0.1  netmask 255.0.0.0
        inet6 ::1  prefixlen 128  scopeid 0x10<host>
        loop  txqueuelen 1000  (Local Loopback)
        RX packets 42489  bytes 3705422 (3.7 MB)
        RX errors 0  dropped 0  overruns 0  frame 0
        TX packets 42489  bytes 3705422 (3.7 MB)
        TX errors 0  dropped 0 overruns 0  carrier 0  collisions 0

## ip
Usage: ip [ OPTIONS ] OBJECT { COMMAND | help }
       ip [ -force ] -batch filename
where  OBJECT := { address | addrlabel | fou | help | ila | ioam | l2tp | link |
                   macsec | maddress | monitor | mptcp | mroute | mrule |
                   neighbor | neighbour | netconf | netns | nexthop | ntable |
                   ntbl | route | rule | sr | tap | tcpmetrics |
                   token | tunnel | tuntap | vrf | xfrm }
       OPTIONS := { -V[ersion] | -s[tatistics] | -d[etails] | -r[esolve] |
                    -h[uman-readable] | -iec | -j[son] | -p[retty] |
                    -f[amily] { inet | inet6 | mpls | bridge | link } |
                    -4 | -6 | -M | -B | -0 |
                    -l[oops] { maximum-addr-flush-attempts } | -br[ief] |
                    -o[neline] | -t[imestamp] | -ts[hort] | -b[atch] [filename] |
                    -rc[vbuf] [size] | -n[etns] name | -N[umeric] | -a[ll] |
                    -c[olor]}


## whois google.com
   Domain Name: GOOGLE.COM
   Registry Domain ID: 2138514_DOMAIN_COM-VRSN
   Registrar WHOIS Server: whois.markmonitor.com
   Registrar URL: http://www.markmonitor.com
   Updated Date: 2019-09-09T15:39:04Z
   Creation Date: 1997-09-15T04:00:00Z
   Registry Expiry Date: 2028-09-14T04:00:00Z
   Registrar: MarkMonitor Inc.
   Registrar IANA ID: 292
   Registrar Abuse Contact Email: abusecomplaints@markmonitor.com
   Registrar Abuse Contact Phone: +1.2086851750
   Domain Status: clientDeleteProhibited https://icann.org/epp#clientDeleteProhibited
   Domain Status: clientTransferProhibited https://icann.org/epp#clientTransferProhibited
   Domain Status: clientUpdateProhibited https://icann.org/epp#clientUpdateProhibited
   Domain Status: serverDeleteProhibited https://icann.org/epp#serverDeleteProhibited
   Domain Status: serverTransferProhibited https://icann.org/epp#serverTransferProhibited
   Domain Status: serverUpdateProhibited https://icann.org/epp#serverUpdateProhibited
   Name Server: NS1.GOOGLE.COM
   Name Server: NS2.GOOGLE.COM
   Name Server: NS3.GOOGLE.COM
   Name Server: NS4.GOOGLE.COM
   DNSSEC: unsigned
   URL of the ICANN Whois Inaccuracy Complaint Form: https://www.icann.org/wicf/
>>> Last update of whois database: 2026-07-08T09:54:06Z <<<

For more information on Whois status codes, please visit https://icann.org/epp

NOTICE: The expiration date displayed in this record is the date the
registrar's sponsorship of the domain name registration in the registry is
currently set to expire. This date does not necessarily reflect the expiration
date of the domain name registrant's agreement with the sponsoring
registrar.  Users may consult the sponsoring registrar's Whois database to
view the registrar's reported date of expiration for this registration.

TERMS OF USE: You are not authorized to access or query our Whois
database through the use of electronic processes that are high-volume and
automated except as reasonably necessary to register domain names or
modify existing registrations; the Data in VeriSign Global Registry
Services' ("VeriSign") Whois database is provided by VeriSign for
information purposes only, and to assist persons in obtaining information
about or related to a domain name registration record. VeriSign does not
guarantee its accuracy. By submitting a Whois query, you agree to abide
by the following terms of use: You agree that you may use this Data only
for lawful purposes and that under no circumstances will you use this Data
to: (1) allow, enable, or otherwise support the transmission of mass
unsolicited, commercial advertising or solicitations via e-mail, telephone,
or facsimile; or (2) enable high volume, automated, electronic processes
that apply to VeriSign (or its computer systems). The compilation,
repackaging, dissemination or other use of this Data is expressly
prohibited without the prior written consent of VeriSign. You agree not to
use electronic processes that are automated and high-volume to access or
query the Whois database except as reasonably necessary to register
domain names or modify existing registrations. VeriSign reserves the right
to restrict your access to the Whois database in its sole discretion to ensure
operational stability.  VeriSign may restrict or terminate your access to the
Whois database for failure to abide by these terms of use. VeriSign
reserves the right to modify these terms at any time.

The Registry database contains ONLY .COM, .NET, .EDU domains and
Registrars.
Domain Name: google.com
Registry Domain ID: 2138514_DOMAIN_COM-VRSN
Registrar WHOIS Server: whois.markmonitor.com
Registrar URL: http://www.markmonitor.com
Updated Date: 2024-08-02T02:17:33+0000
Creation Date: 1997-09-15T07:00:00+0000
Registrar Registration Expiration Date: 2028-09-13T07:00:00+0000
Registrar: MarkMonitor, Inc.
Registrar IANA ID: 292
Registrar Abuse Contact: https://corp.markmonitor.com/domain/ui/abuse-report
Registrar Abuse Contact Phone: +1.2086851750
Domain Status: clientUpdateProhibited (https://www.icann.org/epp#clientUpdateProhibited)
Domain Status: clientTransferProhibited (https://www.icann.org/epp#clientTransferProhibited)
Domain Status: clientDeleteProhibited (https://www.icann.org/epp#clientDeleteProhibited)
Domain Status: serverUpdateProhibited (https://www.icann.org/epp#serverUpdateProhibited)
Domain Status: serverTransferProhibited (https://www.icann.org/epp#serverTransferProhibited)
Domain Status: serverDeleteProhibited (https://www.icann.org/epp#serverDeleteProhibited)
Registrant Organization: Google LLC
Registrant Country: US
Registrant Email: Select Request Email Form at https://domains.markmonitor.com/whois/google.com
Tech Email: Select Request Email Form at https://domains.markmonitor.com/whois/google.com
Name Server: ns4.google.com
Name Server: ns1.google.com
Name Server: ns2.google.com
Name Server: ns3.google.com
DNSSEC: unsigned
URL of the ICANN WHOIS Data Problem Reporting System: http://wdprs.internic.net/
>>> Last update of WHOIS database: 2026-07-08T09:51:02+0000 <<<

For more information on WHOIS status codes, please visit:
  https://www.icann.org/resources/pages/epp-status-codes

If you wish to contact this domain’s Registrant or Technical
contact, and such email address is not visible above, you may do so via our web
form, pursuant to ICANN’s Temporary Specification. To verify that you are not a
robot, please enter your email address to receive a link to a page that
facilitates email communication with the relevant contact(s).

Web-based WHOIS:
  https://domains.markmonitor.com/whois/contact/google.com

If you have a legitimate interest in viewing the non-public WHOIS details, send
your request and the reasons for your request to whoisrequest@markmonitor.com
and specify the domain name in the subject line. We will review that request and
may ask for supporting documentation and explanation.

The data in MarkMonitor’s WHOIS database is provided for information purposes,
and to assist persons in obtaining information about or related to a domain
name’s registration record. While MarkMonitor believes the data to be accurate,
the data is provided "as is" with no guarantee or warranties regarding its
accuracy.

By submitting a WHOIS query, you agree that you will use this data only for
lawful purposes and that, under no circumstances will you use this data to:
  (1) allow, enable, or otherwise support the transmission by email, telephone,
or facsimile of mass, unsolicited, commercial advertising, or spam; or
  (2) enable high volume, automated, or electronic processes that send queries,
data, or email to MarkMonitor (or its systems) or the domain name contacts (or
its systems).

MarkMonitor reserves the right to modify these terms at any time.

By submitting this query, you agree to abide by this policy.

MarkMonitor Domain Management(TM)
Protecting companies and consumers in a digital world.

Visit MarkMonitor at https://www.markmonitor.com
Contact us at +1.8007459229
In Europe, at +44.02032062220

--

## whois 17.0.0.0/8

\#
\# ARIN WHOIS data and services are subject to the Terms of Use
\# available at: https://www.arin.net/resources/registry/whois/tou/
\#
\# If you see inaccuracies in the results, please report at
\# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
\#
\# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
\#



\# start

NetRange:       17.0.0.0 - 17.255.255.255
CIDR:           17.0.0.0/8
NetName:        APPLE-WWNET
NetHandle:      NET-17-0-0-0-1
Parent:          ()
NetType:        Direct Allocation
OriginAS:       
Organization:   Apple Inc. (APPLEC-1-Z)
RegDate:        1990-04-16
Updated:        2025-04-02
Comment:        Geofeed https://ip-geolocation.apple.com
Ref:            https://rdap.arin.net/registry/ip/17.0.0.0



OrgName:        Apple Inc.
OrgId:          APPLEC-1-Z
Address:        One Apple Park Way
City:           Cupertino
StateProv:      CA
PostalCode:     95014
Country:        US
RegDate:        2009-12-14
Updated:        2025-04-22
Ref:            https://rdap.arin.net/registry/entity/APPLEC-1-Z


OrgTechHandle: IPHOS7-ARIN
OrgTechName:   IP Hostmaster
OrgTechPhone:  +1-408-996-1010 
OrgTechEmail:  ip-hostmaster@group.apple.com
OrgTechRef:    https://rdap.arin.net/registry/entity/IPHOS7-ARIN

OrgAbuseHandle: APPLE11-ARIN
OrgAbuseName:   Apple Abuse
OrgAbusePhone:  +1-408-974-7777 
OrgAbuseEmail:  abuse@apple.com
OrgAbuseRef:    https://rdap.arin.net/registry/entity/APPLE11-ARIN


RTechHandle: APPLE141-ARIN
RTechName:   Apple Inc
RTechPhone:  +1-408-996-1010 
RTechEmail:  ip-hostmaster@group.apple.com
RTechRef:    https://rdap.arin.net/registry/entity/APPLE141-ARIN

\# end



\#
\# ARIN WHOIS data and services are subject to the Terms of Use
\# available at: https://www.arin.net/resources/registry/whois/tou/
\#
\# If you see inaccuracies in the results, please report at
\# https://www.arin.net/resources/registry/whois/inaccuracy_reporting/
\#
\# Copyright 1997-2026, American Registry for Internet Numbers, Ltd.
\#

## ip a (ip addr)
1: lo: <LOOPBACK,UP,LOWER_UP> mtu 65536 qdisc noqueue state UNKNOWN group default qlen 1000
    link/loopback 00:00:00:00:00:00 brd 00:00:00:00:00:00
    inet 127.0.0.1/8 scope host lo
       valid_lft forever preferred_lft forever
    inet6 ::1/128 scope host 
       valid_lft forever preferred_lft forever
2: enp2s0: <BROADCAST,MULTICAST,UP,LOWER_UP> mtu 1500 qdisc fq_codel state UP group default qlen 1000
    link/ether f4:6b:8c:8c:ed:40 brd ff:ff:ff:ff:ff:ff
    inet 10.10.1.75/16 brd 10.10.255.255 scope global dynamic noprefixroute enp2s0
       valid_lft 25834sec preferred_lft 25834sec
    inet6 fe80::d4a7:e1b7:cf58:2ec0/64 scope link noprefixroute 
       valid_lft forever preferred_lft forever

## sudo nmap -A 10.10.1.62
Starting Nmap 7.80 ( https://nmap.org ) at 2026-07-08 14:57 IST
Nmap scan report for 10.10.1.62
Host is up (0.00022s latency).
Not shown: 999 closed ports
PORT   STATE SERVICE VERSION
22/tcp open  ssh     OpenSSH 8.9p1 Ubuntu 3ubuntu0.15 (Ubuntu Linux; protocol 2.0)
MAC Address: F4:6B:8C:8C:EE:C0 (Unknown)
No exact OS matches for host (If you know what OS is running on it, see https://nmap.org/submit/ ).
TCP/IP fingerprint:
OS:SCAN(V=7.80%E=4%D=7/8%OT=22%CT=1%CU=32915%PV=Y%DS=1%DC=D%G=Y%M=F46B8C%TM
OS:=6A4E1800%P=x86_64-pc-linux-gnu)SEQ(SP=100%GCD=1%ISR=10B%TI=Z%CI=Z%TS=A)
OS:SEQ(SP=100%GCD=1%ISR=10B%TI=Z%CI=Z%II=I%TS=A)OPS(O1=M5B4ST11NW7%O2=M5B4S
OS:T11NW7%O3=M5B4NNT11NW7%O4=M5B4ST11NW7%O5=M5B4ST11NW7%O6=M5B4ST11)WIN(W1=
OS:FE88%W2=FE88%W3=FE88%W4=FE88%W5=FE88%W6=FE88)ECN(R=Y%DF=Y%T=40%W=FAF0%O=
OS:M5B4NNSNW7%CC=Y%Q=)T1(R=Y%DF=Y%T=40%S=O%A=S+%F=AS%RD=0%Q=)T2(R=N)T3(R=N)
OS:T4(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T5(R=Y%DF=Y%T=40%W=0%S=Z%A=S
OS:+%F=AR%O=%RD=0%Q=)T6(R=Y%DF=Y%T=40%W=0%S=A%A=Z%F=R%O=%RD=0%Q=)T7(R=Y%DF=
OS:Y%T=40%W=0%S=Z%A=S+%F=AR%O=%RD=0%Q=)U1(R=Y%DF=N%T=40%IPL=164%UN=0%RIPL=G
OS:%RID=G%RIPCK=G%RUCK=G%RUD=G)IE(R=Y%DFI=N%T=40%CD=S)

Network Distance: 1 hop
Service Info: OS: Linux; CPE: cpe:/o:linux:linux_kernel

TRACEROUTE
HOP RTT     ADDRESS
1   0.22 ms 10.10.1.62

OS and Service detection performed. Please report any incorrect results at https://nmap.org/submit/ .
Nmap done: 1 IP address (1 host up) scanned in 11.87 seconds


## sudo tcpdump -A tcp
tcpdump: verbose output suppressed, use -v[v]... for full protocol decode
listening on enp2s0, link-type EN10MB (Ethernet), snapshot length 262144 bytes
15:39:18.400476 IP programminglab-ThinkCentre-neo-50s-Gen-3.56632 > 191.144.160.34.bc.googleusercontent.com.https: Flags [P.], seq 1233143907:1233143953, ack 398042259, win 616, options [nop,nop,TS val 1812270851 ecr 1856440], length 46
E..b..@.@.{9

.K"....8..I.Hc.......h.......
l.....S.....)........d....<.U1M....R..}.=..v``gVpGyJ/.
15:39:18.400533 IP programminglab-ThinkCentre-neo-50s-Gen-3.46968 > 146.75.45.91.https: Flags [P.], seq 651172484:651172530, ack 3720372036, win 600, options [nop,nop,TS val 232765486 ecr 1856443], length 46
E..b..@.@...

.K.K-[.x..&....._D...X.O.....
......S.....).........	I .......%...[
...;.....\N..=:.
15:39:18.400673 IP programminglab-ThinkCentre-neo-50s-Gen-3.56632 > 191.144.160.34.bc.googleusercontent.com.https: Flags [P.], seq 46:77, ack 1, win 616, options [nop,nop,TS val 1812270851 ecr 1856440], length 31
E..S..@.@.{G

.K"....8..I.H........h.......
l.....S........................z(..Bhl
15:39:18.400676 IP 146.75.45.91.https > programminglab-ThinkCentre-neo-50s-Gen-3.46968: Flags [.], ack 46, win 1091, options [nop,nop,TS val 1872379 ecr 232765486], length 0
E..4..@.@....K-[

.K...x.._D&......C.......
........
15:39:18.400691 IP programminglab-ThinkCentre-neo-50s-Gen-3.56632 > 191.144.160.34.bc.googleusercontent.com.https: Flags [F.], seq 77, ack 1, win 616, options [nop,nop,TS val 1812270851 ecr 1856440], length 0
E..4..@.@.{e


