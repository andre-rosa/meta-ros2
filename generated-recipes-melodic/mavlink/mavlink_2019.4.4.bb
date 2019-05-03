# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "MAVLink message marshaling library.   This package provides C-headers and C++11 library   for both 1.0 and 2.0 versions of protocol.    For pymavlink use separate install via rosdep (python-pymavlink)."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://qgroundcontrol.org/mavlink/"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_BPN = "mavlink"

ROS_BUILD_DEPENDS = " \
    python \
    python-futures \
    python-lxml \
    python-setuptools \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    catkin \
    python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mavlink/mavlink-gbp-release/archive/release/melodic/mavlink/2019.4.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6d055e7b34e16301003ed76cd52f7015"
SRC_URI[sha256sum] = "ae60116d328ad383dfd3bfe663586b9c39241b44ae58dc502d15a44cc5a30930"
S = "${WORKDIR}/mavlink-gbp-release-release-melodic-mavlink-2019.4.4-0"

ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('mavlink', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mavlink/mavlink_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mavlink/mavlink-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mavlink/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/mavlink/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
