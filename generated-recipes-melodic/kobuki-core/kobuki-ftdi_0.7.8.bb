# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Utilities for flashing and enabling Kobuki's USB connection. 	    This package contains tools for flashing the Kobuki's FTDI chip (usually done at the factory). 	    The special firmware for the FTDI chip (USB to serial converter) enables it to appear as 	    /dev/kobuki on the user's PC."
AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_ftdi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-command-line \
    ftdi-eeprom \
    libftdi-dev \
    libusb-dev \
    pkgconfig \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-command-line \
    ftdi-eeprom \
    libftdi-dev \
    libusb-dev \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-command-line \
    ftdi-eeprom \
    libftdi-dev \
    libusb-dev \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_ftdi/0.7.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dd3b9bd83e1d0cc248eb5858baf3f2e3"
SRC_URI[sha256sum] = "e1c6ba8e7d1fbd11de09faca56c7dd845fb12aa44432909e2ae0df6867296828"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_ftdi-0.7.8-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/kobuki-core/kobuki-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/kobuki-core/kobuki-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/kobuki-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/kobuki-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
