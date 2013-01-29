package stericson.busybox;



public class Constants {

	private static int		NONE = 0,
							UPDATE = 1,
							NEW = 2,
							BOTH = 3;

	public static int		updateType = NONE;

	public static String	EXTRA_BUSYBOX_VERSION = "version",
							EXTRA_INSTALL_PATH = "path";
	public static String 	Key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAk78EBO78KPQkOCo2SCPqImOv6ViRmY7Vy/d5xOi1+B1mJEWtHreHxrDw9sdyVaxbd3X/PnFIUQzj2Qk159RMP7p2lIiJ1yYVyifOciVV1f4r2z7llCKMJYCVVe0k+9P5SVEWZWoV+5QqJqm06pZ12ChsMNUN+3JujIUtiCARVn4wBmCT+eXfHcxmhyVfnE4a+3FlLGYrnCKE2B6AhcHXJXfPaW3K4P6JMDbWGoxO6yM/qPHqsfbsZK45Ooaqs1To2Oe6b7SaaAxAXPGipTCzQ7x8BRnMLkTMoLVDN0ABVlCgYpcWB9HysPALIXstSUWeGnF4WptkAfc34sQZm42DsQIDAQAB";
		
	public static String[] versions = { "BusyBox 1.20.2", "BusyBox 1.20.1", "BusyBox 1.20.0", "BusyBox 1.19.4", "Custom Version"};
	
	public static String[] locations = { "/system/bin", "/system/xbin", "Custom Path" };
		
	public static String[] appletsString = new String[] 
			{
				"[",
				"[[",
				"ash",
				"awk",
				"base64",
				"basename",
				"blkid",
				"bunzip2",
				"bzip2",
				"cal",
				"cat",
				"chat",
				"chattr",
				"chgrp",
				"chmod",
				"chown",
				"chroot",
				"chrt",
				"cksum",
				"clear",
				"comm",
				"cp",
				"crond",
				"crontab",
				"cut",
				"date",
				"dd",
				"depmod",
				"devmem",
				"df",
				"diff",
				"dirname",
				"dmesg",
				"dnsd",
				"dnsdomainname",
				"dos2unix",
				"du",
				"echo",
				"egrep",
				"env",
				"ether-wake",
				"expand",
				"expr",
				"fakeidentd",
				"fdflush",
				"fdformat",
				"fdisk",
				"fgrep",
				"find",
				"fold",
				"free",
				"freeramdisk",
				"fsck",
				"fsync",
				"ftpd",
				"ftpget",
				"ftpput",
				"getopt",
				"grep",
				"groups",
				"gunzip",
				"gzip",
				"hd",
				"head",
				"hexdump",
				"hostid",
				"hostname",
				"httpd",
				"hwclock",
				"id",
				"ifconfig",
				"ifenslave",
				"inetd",
				"inotifyd",
				"insmod",
				"install",
				"ionice",
				"iostat",
				"ip",
				"ipaddr",
				"ipcalc",
				"iplink",
				"iproute",
				"iprule",
				"iptunnel",
				"kill",
				"killall",
				"killall5",
				"less",
				"ln",
				"logname",
				"losetup",
				"ls",
				"lsattr",
				"lsmod",
				"lsusb",
				"lzop",
				"lzopcat",
				"md5sum",
				"mkdir",
				"mkdosfs",
				"microcom",
				"mke2fs",
				"mkfifo",
				"mkfs.ext2",
				"mkfs.vfat",
				"mknod",
				"mkswap",
				"modinfo",
				"modprobe",
				"more",
				"mount",
				"mt",
				"mv",
				"nameif",
				"nanddump",
				"nandwrite",
				"nc",
				"netstat",
				"nice",
				"nmeter",
				"nslookup",
				"ntpd",
				"od",
				"patch",
				"pgrep",
				"pidof",
				"ping",
				"ping6",
				"pkill",
				"pmap",
				"powertop",
				"printenv",
				"printf",
				"ps",
				"pscan",
				"pwd",
				"rdate",
				"rdev",
				"readahead",
				"readlink",
				"realpath",
				"renice",
				"reset",
				"rev",
				"rfkill",
				"rm",
				"rmdir",
				"rmmod",
				"route",
				"run-parts",
				"script",
				"scriptreplay",
				"sed",
				"seq",
				"setkeycodes",
				"setlogcons",
				"setsid",
				"sha1sum",
				"sha256sum",
				"sha512sum",
				"showkey",
				"sleep",
				"smemcap",
				"sort",
				"split",
				"stat",
				"strings",
				"stty",
				"sum",
				"swapoff",
				"swapon",
				"sync",
				"sysctl",
				"tac",
				"tail",
				"tar",
				"tee",
				"telnet",
				"telnetd",
				"test",
				"tftp",
				"tftpd",
				"time",
				"timeout",
				"top",
				"touch",
				"tr",
				"traceroute",
				"traceroute6",
				"tty",
				"ttysize",
				"tunctl",
				"umount",
				"uname",
				"uncompress",
				"unexpand",
				"uniq",
				"unix2dos",
				"unlzop",
				"unzip",
				"uptime",
				"usleep",
				"uudecode",
				"uuencode",
				"vconfig",
				"vi",
				"watch",
				"wc",
				"wget",
				"which",
				"who",
				"whoami",
				"whois",
				"xargs",
				"zcat"
			};

	public static String[] appletsUsage = new String[] 
  			{
  				"Usage: [ EXPRESSION ] \n\n Check file types, compare values etc. Return a 0/1 exit code depending on logical value of EXPRESSION",
  				"Usage: [ EXPRESSION ] \n\n Check file types, compare values etc. Return a 0/1 exit code depending on logical value of EXPRESSION",
  				"Usage: ash [-/+OPTIONS] [-/+o OPT]... [-c 'SCRIPT' [ARG0 [ARGS]] / FILE [ARGS]] \n\n Unix shell interpreter",
  				"awk [OPTIONS] [AWK_PROGRAM] [FILE]... \n\n Options: \n\n -v VAR=VAL      Set variable \n -F SEP          Use SEP as field separator \n\n -f FILE         Read program from file",
  				"Usage: base64 [-d] [FILE] \n\nBase64 encode or decode FILE to standard output \n\n 	-d	Decode data",
  				"basename FILE [SUFFIX] \n\n Strip directory path and .SUFFIX from FILE",
  				"blkid \n\n Print UUIDs of all filesystems",
  				"bunzip2 [OPTIONS] [FILE] \n\n Uncompress FILE (or standard input if FILE is '-' or omitted) \n\n Options: \n\n        -c      Write to standard output \n        -f      Force",
  				"bzip2 [OPTIONS] [FILE]... \n\n Compress FILE(s) with bzip2 algorithm. When FILE is '-' or unspecified, reads standard input. Implies -c. \n\n Options: \n\n         -c      Write to standard output \n        -d      Decompress \n        -f      Force \n        -1..-9  Compression level",
  				"cal [-jy] [[month] year] \n\n Display a calendar \n\n Options: \n\n         -j      Use julian dates \n         -y      Display the entire year",
  				"cat [-u] [FILE]... \n\n Concatenate FILE(s) and print them to stdout \n\n Options: \n\n        -u      Use unbuffered i/o (ignored)",
  				"chat EXPECT [SEND [EXPECT [SEND...]]] \n\n Useful for interacting with a modem connected to stdin/stdout. A script consists of one or more \"expect-send\" pairs of strings, each pair is a pair of arguments. Example: chat '' ATZ OK ATD123456 CONNECT '' ogin: pppuser word: ppppass '~'",
  				"chattr [-R] [-+=AacDdijsStTu] [-v version] files... \n\n Change file attributes on an ext2 fs \n\n Modifiers:\n        -       Remove attributes\n        +       Add attributes\n        =       Set attributes \n Attributes: \n\n        A       Don't track atime \n        a       Append mode only \n        c       Enable compress \n        D       Write dir contents synchronously \n        d       Do not backup with dump \n        i       Cannot be modified (immutable) \n        j       Write all data to journal first \n        s       Zero disk storage when deleted \n        S       Write file contents synchronously \n        t       Disable tail-merging of partial blocks with other files \n        u       Allow file to be undeleted \nOptions: \n\n        -R      Recursively list subdirectories \n        -v      Set the file's version/generation number",
  				"chgrp [-RhLHPcvf]... GROUP FILE... \n\n Change the group membership of each FILE to GROUP \n\n Options: \n        -R      Recurse \n        -h      Affect symlinks instead of symlink targets \n        -L      Traverse all symlinks to directories \n        -H      Traverse symlinks on command line only \n        -P      Do not traverse symlinks (default) \n        -c      List changed files \n        -v      Verbose \n        -f      Hide errors",
  				"chmod [-Rcvf] MODE[,MODE]... FILE... \n\n Each MODE is one or more of the letters ugoa, one of the symbols +-= and one or more of the letters rwxst \n\n Options: \n\n        -R      Recurse \n        -c      List changed files \n        -v      List all files \n        -f      Hide errors",
  				"chown [-RhLHPcvf]... OWNER[<.|:>[GROUP]] FILE... \n\n Change the owner and/or group of each FILE to OWNER and/or GROUP \n\n Options: \n\n        -R      Recurse \n        -h      Affect symlinks instead of symlink targets \n        -L      Traverse all symlinks to directories \n        -H      Traverse symlinks on command line only \n        -P      Do not traverse symlinks (default) \n        -c      List changed files \n        -v      List all files \n        -f      Hide errors",
  				"chroot NEWROOT [PROG [ARGS]] \n\n Run PROG with root directory set to NEWROOT",
  				"chrt [OPTIONS] [PRIO] [PID | PROG [ARGS]] \n\n Manipulate real-time attributes of a process \n\n Options: \n\n        -p      Operate on pid \n        -r      Set scheduling policy to SCHED_RR \n        -f      Set scheduling policy to SCHED_FIFO \n        -o      Set scheduling policy to SCHED_OTHER \n        -m      Show min and max priorities",
  				"cksum FILES... \n\n Calculate the CRC32 checksums of FILES",
  				"clear \n\n Clear screen",
  				"comm [-123] FILE1 FILE2 \n\n Compare FILE1 to FILE2, or to stdin if - is specified \n\n Options: \n\n        -1      Suppress lines unique to FILE1 \n        -2      Suppress lines unique to FILE2 \n        -3      Suppress lines common to both files",
  				"cp [OPTIONS] SOURCE DEST \n\n Copy SOURCE to DEST, or multiple SOURCE(s) to DIRECTORY \n\n Options: \n\n        -a      Same as -dpR \n        -d,-P   Preserve links \n        -H,-L   Dereference all symlinks (default) \n        -p      Preserve file attributes if possible \n        -f      Force overwrite \n        -i      Prompt before overwrite \n        -R,-r   Recurse \n        -l,-s   Create (sym)links",
  				"crond -fbS -l N -d N -L LOGFILE -c DIR \n\n        -f      Foreground \n        -b      Background (default) \n        -S      Log to syslog (default) \n        -l      Set log level. 0 is the most verbose, default 8 \n        -d      Set log level, log to stderr \n        -L      Log to file \n        -c      Working dir",
  				"crontab [-c DIR] [-u USER] [-ler]|[FILE] \n\n        -c      Crontab directory \n        -u      User \n        -l      List crontab \n        -e      Edit crontab \n        -r      Delete crontab \n        FILE    Replace crontab by FILE ('-': stdin)",
  				"cut [OPTIONS] [FILE]... \n\n Print selected fields from each input FILE to standard output \n\n Options: \n\n        -b LIST Output only bytes from LIST \n        -c LIST Output only characters from LIST \n        -d CHAR Use CHAR instead of tab as the field delimiter \n        -s      Output only the lines containing delimiter \n        -f N    Print only these fields \n        -n      Ignored",
  				"date",
  				"dd",
  				"depmod",
  				"devmem",
  				"df",
  				"diff",
  				"dirname",
  				"dmesg",
  				"dnsd",
  				"dnsdomainname",
  				"dos2unix",
  				"du",
  				"echo",
  				"egrep",
  				"env",
  				"ether-wake",
  				"expand",
  				"expr",
  				"fakeidentd",
  				"fdflush",
  				"fdformat",
  				"fdisk",
  				"fgrep",
  				"find",
  				"fold",
  				"free",
  				"freeramdisk",
  				"fsck",
  				"fsync",
  				"ftpd",
  				"ftpget",
  				"ftpput",
  				"getopt",
  				"grep",
  				"groups",
  				"gunzip",
  				"gzip",
  				"hd",
  				"head",
  				"hexdump",
  				"hostid",
  				"hostname",
  				"httpd",
  				"hwclock",
  				"id",
  				"ifconfig",
  				"ifenslave",
  				"inetd",
  				"inotifyd",
  				"insmod",
  				"install",
  				"ionice",
  				"iostat",
  				"ip",
  				"ipaddr",
  				"ipcalc",
  				"iplink",
  				"iproute",
  				"iprule",
  				"iptunnel",
  				"kill",
  				"killall",
  				"killall5",
  				"less",
  				"ln",
  				"logname",
  				"losetup",
  				"ls",
  				"lsattr",
  				"lsmod",
  				"lsusb",
  				"lzop",
  				"lzopcat",
  				"md5sum",
  				"mkdir",
  				"mkdosfs",
  				"microcom",
  				"mke2fs",
  				"mkfifo",
  				"mkfs.ext2",
  				"mkfs.vfat",
  				"mknod",
  				"mkswap",
  				"modinfo",
  				"modprobe",
  				"more",
  				"mount",
  				"mt",
  				"mv",
  				"nameif",
  				"nanddump",
  				"nandwrite",
  				"nc",
  				"netstat",
  				"nice",
  				"nmeter",
  				"nslookup",
  				"ntpd",
  				"od",
  				"patch",
  				"pgrep",
  				"pidof",
  				"ping",
  				"ping6",
  				"pkill",
  				"pmap",
  				"powertop",
  				"printenv",
  				"printf",
  				"ps",
  				"pscan",
  				"pwd",
  				"rdate",
  				"rdev",
  				"readahead",
  				"realpath",
  				"renice",
  				"reset",
  				"rev",
  				"rfkill",
  				"rm",
  				"rmdir",
  				"rmmod",
  				"route",
  				"run-parts",
  				"script",
  				"scriptreplay",
  				"sed",
  				"seq",
  				"setkeycodes",
  				"setlogcons",
  				"setsid",
  				"sha1sum",
  				"sha256sum",
  				"sha512sum",
  				"showkey",
  				"sleep",
  				"smemcap",
  				"sort",
  				"split",
  				"stat",
  				"strings",
  				"stty",
  				"sum",
  				"swapoff",
  				"swapon",
  				"sync",
  				"sysctl",
  				"tac",
  				"tail",
  				"tar",
  				"tee",
  				"telnet",
  				"telnetd",
  				"test",
  				"tftp",
  				"tftpd",
  				"time",
  				"timeout",
  				"top",
  				"touch",
  				"tr",
  				"traceroute",
  				"traceroute6",
  				"tty",
  				"ttysize",
  				"tunctl",
  				"umount",
  				"uname",
  				"uncompress",
  				"unexpand",
  				"uniq",
  				"unix2dos",
  				"unlzop",
  				"unzip",
  				"uptime",
  				"usleep",
  				"uudecode",
  				"uuencode",
  				"vconfig",
  				"vi",
  				"watch",
  				"wc",
  				"wget",
  				"which",
  				"who",
  				"whoami",
  				"whois",
  				"xargs",
  				"zcat"
  			};
}