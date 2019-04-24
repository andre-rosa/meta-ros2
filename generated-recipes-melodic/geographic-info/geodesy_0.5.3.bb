# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python and C++ interfaces for manipulating geodetic coordinates."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/geodesy"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    angles \
    geographic-msgs \
    geometry-msgs \
    python-catkin-pkg \
    sensor-msgs \
    tf \
    unique-id \
    uuid-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    python-pyproj \
    sensor-msgs \
    tf \
    unique-id \
    uuid-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    python-pyproj \
    sensor-msgs \
    tf \
    unique-id \
    uuid-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-geographic-info/geographic_info-release/archive/release/melodic/geodesy/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b3dd5762ef543ad7b59fdb01cfe3ed22"
SRC_URI[sha256sum] = "58e20388e22a583385b39acf097e80a508617623d484f29a30f31ee96558f58b"
S = "${WORKDIR}/geographic_info-release-release-melodic-geodesy-0.5.3-0"

ROS_BUILD_TYPE = "catkin"
ROS_RECIPES_TREE = "recipes-ros2"
ROS_DEPENDENCY_GROUPS = ""

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/geographic-info/geographic-info_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/geographic-info/geographic-info_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geographic-info/geographic-info-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geographic-info/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/geographic-info/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
inherit ${@ros_superflore_generated__prefix_all('ROS_DEPENDENCY_GROUPS', 'ros_depgrp_', d)}
