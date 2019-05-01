# Copyright (c) 2019 LG Electronics, Inc.

# XXX Temp until superflore adds to skip list.
RDEPENDS_${PN}_remove = "flatbuffers"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ffmpeg', d)}"
