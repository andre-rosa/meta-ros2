# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Tests for MAVROS package"
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Nuno Marques <n.marques21@hotmail.com>"
HOMEPAGE = "https://github.com/mavlink/mavros.git"
SECTION = "devel"
LICENSE = "BSD & GPL-3 & LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mavros"
ROS_BPN = "test_mavros"

ROS_BUILD_DEPENDS = " \
    angles \
    cmake-modules \
    control-toolbox \
    eigen-conversions \
    geometry-msgs \
    libeigen \
    mavros \
    mavros-extras \
    roscpp \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-toolbox \
    eigen-conversions \
    geometry-msgs \
    libeigen \
    mavros \
    mavros-extras \
    roscpp \
    std-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-toolbox \
    eigen-conversions \
    geometry-msgs \
    libeigen \
    mavros \
    mavros-extras \
    roscpp \
    std-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/test_mavros/0.29.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4fd140aa3a47f7f530be1e74a2b2def3"
SRC_URI[sha256sum] = "de15444e834540abb574c250800527f2d808fe7590139785ea7df46a07b5fe87"
S = "${WORKDIR}/mavros-release-release-melodic-test_mavros-0.29.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mavros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mavros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/mavros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/mavros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
