# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The robot description files for the RexROV 2 underwater vehicle"
AUTHOR = "Musa Morena Marcusso Manhaes <Musa.Marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_BPN = "rexrov2_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
    gazebo-ros-control \
    robot-state-publisher \
    uuv-assistants \
    uuv-descriptions \
    uuv-gazebo-ros-plugins \
    uuv-sensor-ros-plugins \
    xacro \
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

SRC_URI = "https://github.com/uuvsimulator/rexrov2-release/archive/release/melodic/rexrov2_description/0.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7dada6fd6a5882fed9925f10579c280b"
SRC_URI[sha256sum] = "a4da8b1fd519c66c4156c38ff1107731858cf630ef0194fd3fe2e5950a450940"
S = "${WORKDIR}/rexrov2-release-release-melodic-rexrov2_description-0.1.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rexrov2/rexrov2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rexrov2/rexrov2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/rexrov2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rexrov2/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
