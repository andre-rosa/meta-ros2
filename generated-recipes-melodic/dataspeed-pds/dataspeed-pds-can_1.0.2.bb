# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface to the Dataspeed Inc. Power Distribution System (PDS) via CAN"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    can-msgs \
    dataspeed-can-msg-filters \
    dataspeed-pds-msgs \
    message-filters \
    nodelet \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    can-msgs \
    dataspeed-pds-msgs \
    message-filters \
    nodelet \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    can-msgs \
    dataspeed-can-usb \
    dataspeed-pds-msgs \
    message-filters \
    nodelet \
    roscpp \
    roslaunch \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/melodic/dataspeed_pds_can/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "58c660c39f46d112516d4f82ddb77b7e"
SRC_URI[sha256sum] = "9ac85ae64a11d73e1049f6971720e1dddfe9af4548df5ed6cd083d855d60dbd4"
S = "${WORKDIR}/dataspeed_pds-release-release-melodic-dataspeed_pds_can-1.0.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/dataspeed-pds/dataspeed-pds_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/dataspeed-pds/dataspeed-pds_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-pds/dataspeed-pds-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-pds/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/dataspeed-pds/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
