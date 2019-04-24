# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Shared communication types for the concert framework."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/concert_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_BUILD_DEPENDS = " \
    gateway-msgs \
    message-generation \
    rocon-app-manager-msgs \
    rocon-std-msgs \
    std-msgs \
    uuid-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gateway-msgs \
    message-runtime \
    rocon-app-manager-msgs \
    rocon-std-msgs \
    std-msgs \
    uuid-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gateway-msgs \
    message-runtime \
    rocon-app-manager-msgs \
    rocon-std-msgs \
    std-msgs \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/melodic/concert_msgs/0.9.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ed50a1da07fcdb6f6ac47e890b3b8b50"
SRC_URI[sha256sum] = "2b90b553b2fc831b783dda1382fddbd81c507f33988189768ac44fc0106afac2"
S = "${WORKDIR}/rocon_msgs-release-release-melodic-concert_msgs-0.9.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rocon-msgs/rocon-msgs_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rocon-msgs/rocon-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/rocon-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rocon-msgs/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
