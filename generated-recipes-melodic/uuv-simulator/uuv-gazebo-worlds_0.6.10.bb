# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The uuv_gazebo_worlds package"
AUTHOR = "Musa Morena Marcusso Manhaes <musa.marcusso@de.bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/uuv_simulator-release/archive/release/melodic/uuv_gazebo_worlds/0.6.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f07b8c6422ed20b2a877ed2573b6f25d"
SRC_URI[sha256sum] = "10b68d74ce5c2ceb1abc57e18c55bd18d1558467b45007cd9709f08b85b15ad3"
S = "${WORKDIR}/uuv_simulator-release-release-melodic-uuv_gazebo_worlds-0.6.10-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/uuv-simulator/uuv-simulator_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/uuv-simulator/uuv-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/uuv-simulator/uuv-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/uuv-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/uuv-simulator/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
