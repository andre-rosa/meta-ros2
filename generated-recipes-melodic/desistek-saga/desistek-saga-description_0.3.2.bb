# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The robot description files for the Desistek SAGA ROV underwater vehicle"
AUTHOR = "Emre Ege <emre.ege@desistek.com.tr>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    robot-state-publisher \
    uuv-assistants \
    uuv-descriptions \
    uuv-gazebo-ros-plugins \
    uuv-sensor-ros-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rosunit \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/desistek_saga-release/archive/release/melodic/desistek_saga_description/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "9d13ac739ffbe638e309ce7ece4948e1"
SRC_URI[sha256sum] = "1d23906087b0f5b4119ca5b63d3d621a40f93709a58a61fdab09330e3f712126"
S = "${WORKDIR}/desistek_saga-release-release-melodic-desistek_saga_description-0.3.2-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/desistek-saga/desistek-saga_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/desistek-saga/desistek-saga_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/desistek-saga/desistek-saga-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/desistek-saga/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/desistek-saga/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
