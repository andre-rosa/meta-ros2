# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in Python."
AUTHOR = "Mikael Arguedas <mikael@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rmw \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    ament-index-python-native \
    python-cmake-module-native \
    rosidl-cmake-native \
    rosidl-typesupport-c-native \
    rosidl-typesupport-interface-native \
"

ROS_EXEC_DEPENDS = " \
    rmw-implementation \
    rmw-implementation-cmake \
    rosidl-generator-c \
    rosidl-parser \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-index-python \
    ament-lint-auto \
    ament-lint-common \
    python3-pytest \
    python-cmake-module \
    rmw \
    rmw-implementation \
    rmw-implementation-cmake \
    rosidl-cmake \
    rosidl-generator-c \
    rosidl-parser \
    rosidl-typesupport-c \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rosidl_python-release/archive/release/bouncy/rosidl_generator_py/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "2e074a1c86d2f4d56f210a464acfabcb"
SRC_URI[sha256sum] = "8735329c6c55efd8aa6a6ea1c02b7c8b753c81b98034c8fdbc0831975c793a28"
S = "${WORKDIR}/rosidl_python-release-release-bouncy-rosidl_generator_py-0.5.2-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rosidl-python/rosidl-python_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rosidl-python/rosidl-python_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-python/rosidl-python-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-python/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rosidl-python/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
