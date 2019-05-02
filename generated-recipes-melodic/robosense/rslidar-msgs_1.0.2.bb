# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS message definitions for Rslidar 3D LIDARs."
AUTHOR = "Abraham Monrroy <abrahammonrroy@yahoo.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=01c2bc31767ccb3a68e12f02612b2a97"

ROS_BPN = "rslidar_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/CPFL/robosense-release/archive/release/melodic/rslidar_msgs/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "70f1b465082886b6709e3b81eea87fd5"
SRC_URI[sha256sum] = "5e648cc16e6b3f0db83e8ce00c9609f6f2da14f0d29951c2cb63e2e2716f953d"
S = "${WORKDIR}/robosense-release-release-melodic-rslidar_msgs-1.0.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/robosense/robosense_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/robosense/robosense_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robosense/robosense-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robosense/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robosense/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
