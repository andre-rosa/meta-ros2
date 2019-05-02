# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ml_classifiers"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/ml_classifiers"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "ml_classifiers"

ROS_BUILD_DEPENDS = " \
    libeigen \
    message-generation \
    pluginlib \
    roscpp \
    roslib \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
    ros-environment-native \
"

ROS_EXPORT_DEPENDS = " \
    libeigen \
    pluginlib \
    roscpp \
    roslib \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libeigen \
    message-runtime \
    pluginlib \
    roscpp \
    roslib \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/astuff/ml_classifiers-release/archive/release/melodic/ml_classifiers/1.0.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c41a0e1479d5256e3022717931a50449"
SRC_URI[sha256sum] = "77588596b459e29cb22098164289c3b74e0a6326d372c99ce6025a422a21c564"
S = "${WORKDIR}/ml_classifiers-release-release-melodic-ml_classifiers-1.0.1-1"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ml-classifiers/ml-classifiers_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ml-classifiers/ml-classifiers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ml-classifiers/ml-classifiers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ml-classifiers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ml-classifiers/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
