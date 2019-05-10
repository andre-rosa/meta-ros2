# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Chrysler Pacifica DBW kit"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dbw_fca_ros"
ROS_BPN = "dbw_fca"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dbw-fca-can \
    dbw-fca-description \
    dbw-fca-joystick-demo \
    dbw-fca-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8979bb854673d430ceb4c75bd5cb8154"
SRC_URI[sha256sum] = "971b88a77e2907f4fcd3cff91033cc784bdceb4f51d784bd9f01826128cd3c31"
S = "${WORKDIR}/dbw_fca_ros-release-release-melodic-dbw_fca-1.0.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('dbw-fca-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('dbw-fca-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dbw-fca-ros/dbw-fca-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dbw-fca-ros/dbw-fca-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dbw-fca-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/dbw-fca-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
