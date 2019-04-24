# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Extends the arbotix_node package with a number of more sophisticated ROS wrappers for common devices."
AUTHOR = "Michael Ferguson <mike@vanadiumlabs.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/arbotix_sensors"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "arbotix"
ROS_BPN = "arbotix_sensors"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    arbotix-python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    arbotix-python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_sensors/0.10.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8e92a45f802c49a92652a0c9a285f17a"
SRC_URI[sha256sum] = "2c7dcfa8c133915b15eb77783282f2be0b01ac676239daefba4285885e58f722"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_sensors-0.10.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('arbotix', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('arbotix', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/arbotix/arbotix_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/arbotix/arbotix-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/arbotix/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/arbotix/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
