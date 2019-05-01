# Copyright (c) 2019 LG Electronics, Inc.

# XXX Temp until superflore adds to skip list.
RDEPENDS_${PN}_remove = "flatbuffers"

# OE won't let us build ffmpeg unless LICENSE_FLAGS_WHITELIST contains "commerical".
RDEPENDS_${PN}_remove = "${@bb.utils.contains('LICENSE_FLAGS_WHITELIST', 'commercial', '', 'ffmpeg', d)}"

# behaviortree-cpp-v3 and behaviortree-cpp are mutually exclusive. No other package depends on either of these.
RDEPENDS_${PN}_remove = "${@bb.utils.contains('DISTRO_FEATURES', 'ros-behaviortree-cpp-v3', 'behaviortree-cpp', 'behaviortree-cpp-v3', d)}"
