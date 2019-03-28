# bionic/ros-distro-plaform-preferred-versions.inc
#
# Copyright (c) 2019 LG Electronics, Inc.

# PREFERRED_VERSION_<PN> settings for platform packages used when DISTRO is ROS_DISTRO_TYPE for which the layers provide multiple
# versions.

PREFERRED_VERSION_cppunit ?= "1.14.0"
# Ubuntu bionic has v4.15, but meta-raspberrypi thud only provides v4.9 and v4.14 => select the latter as the former is more
# likely to be missing something that other components expect to be present.
PREFERRED_VERSION_linux-raspberrypi ?= "4.14%"
# Ubuntu bionic has v4.15, but OpenEmbedded thud only provides v4.14 and v4.18 => select the former to match linux-raspberrypi.
PREFERRED_VERSION_linux-yocto ?= "4.14%"
PREFERRED_VERSION_python-matplotlib ?= "2.1.1"
PREFERRED_VERSION_yajl ?= "2.1.0"